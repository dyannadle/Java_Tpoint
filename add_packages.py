import os

base_dir = r"d:\Java_Tpoint-1"
# Process all subdirectories in the base_dir
folders_to_process = [d for d in os.listdir(base_dir) if os.path.isdir(os.path.join(base_dir, d)) and not d.startswith(".")]

def add_package(file_path, package_name):
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    if content.strip().startswith("package "):
        # Check if the package is correct
        current_pkg = content.split(";")[0].replace("package ", "").strip()
        if current_pkg == package_name:
            print(f"Skipping {file_path} (already has correct package)")
            return
        else:
            # Replace old package with correct one
            print(f"Updating package in {file_path} from {current_pkg} to {package_name}")
            new_content = content.replace(f"package {current_pkg};", f"package {package_name};")
    else:
        pkg_declaration = f"package {package_name};\n\n"
        new_content = pkg_declaration + content
        print(f"Added package {package_name} to {file_path}")
    
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(new_content)

for top_folder in folders_to_process:
    full_top_path = os.path.join(base_dir, top_folder)
    
    for root, dirs, files in os.walk(full_top_path):
        for file in files:
            if file.endswith(".java"):
                rel_path = os.path.relpath(root, base_dir)
                package_name = rel_path.replace(os.sep, ".")
                package_name = package_name.replace(" ", "_").replace("-", "_")
                
                full_file_path = os.path.join(root, file)
                add_package(full_file_path, package_name)

print("Done comprehensive package update.")
